class FoodRatings {
    Map<String,Integer> ratingMap;
    Map<String,String> cuisineMap;
    Map<String,TreeSet<String>> cuisineSet; 
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        ratingMap = new HashMap<>();
        cuisineMap = new HashMap<>();
        cuisineSet = new HashMap<>();

        for(int i=0; i<foods.length; i++)
        {
            String food = foods[i];
            ratingMap.put(food,ratings[i]);
            cuisineMap.put(food,cuisines[i]);

            cuisineSet.computeIfAbsent(cuisines[i], k -> new TreeSet<>(
                (a,b) -> {
                    int diff = ratingMap.get(b) - ratingMap.get(a);
                    if(diff == 0) return a.compareTo(b);
                    return diff;
                }
            ));
            cuisineSet.get(cuisines[i]).add(food);
        }
    }
    
    public void changeRating(String food, int newRating) {
        String cuisine = cuisineMap.get(food);
        TreeSet<String> set = cuisineSet.get(cuisine);

        set.remove(food);
        ratingMap.put(food,newRating);
        set.add(food);
    }
    
    public String highestRated(String cuisine) {
        return cuisineSet.get(cuisine).first();
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */