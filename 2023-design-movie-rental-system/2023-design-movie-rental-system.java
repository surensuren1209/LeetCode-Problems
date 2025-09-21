class MovieRentingSystem {
    Map<Integer, TreeSet<int[]>> available = new HashMap<>();
    TreeSet<int[]> rented = new TreeSet<>((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] != b[1] ? a[1] - b[1] : a[2] - b[2]);
    Map<String, Integer> priceMap = new HashMap<>();

    public MovieRentingSystem(int n, int[][] entries) {
        for (int[] e : entries) {
            available.computeIfAbsent(e[1], k -> new TreeSet<>((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1])).add(new int[]{e[2], e[0]});
            priceMap.put(e[0] + "_" + e[1], e[2]);
        }
    }

    public List<Integer> search(int movie) {
        List<Integer> res = new ArrayList<>();
        if (available.containsKey(movie)) for (int[] p : available.get(movie)) { res.add(p[1]); if (res.size() == 5) break; }
        return res;
    }

    public void rent(int shop, int movie) {
        int price = priceMap.get(shop + "_" + movie);
        available.get(movie).remove(new int[]{price, shop});
        rented.add(new int[]{price, shop, movie});
    }

    public void drop(int shop, int movie) {
        int price = priceMap.get(shop + "_" + movie);
        rented.remove(new int[]{price, shop, movie});
        available.get(movie).add(new int[]{price, shop});
    }

    public List<List<Integer>> report() {
        List<List<Integer>> res = new ArrayList<>();
        for (int[] r : rented) { res.add(Arrays.asList(r[1], r[2])); if (res.size() == 5) break; }
        return res;
    }
}