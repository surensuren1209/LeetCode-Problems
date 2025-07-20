import java.util.*;

class Solution {
    class Node {
        Map<String, Node> map = new HashMap<>();
        String key;
        boolean isDup = false;
    }

    Map<String, Node> seen = new HashMap<>();

    public List<List<String>> deleteDuplicateFolder(List<List<String>> paths) {
        Node root = new Node();

        for (List<String> path : paths) {
            Node cur = root;
            for (String folder : path) {
                cur.map.putIfAbsent(folder, new Node());
                cur = cur.map.get(folder);
                cur.key = folder;
            }
        }

        serialize(root);

        List<List<String>> res = new ArrayList<>();
        dfs(root, new ArrayList<>(), res);
        return res;
    }

    String serialize(Node node) {
        if (node.map.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        for (String name : new TreeSet<>(node.map.keySet())) {
            sb.append("(").append(name).append(serialize(node.map.get(name))).append(")");
        }

        String serial = sb.toString();
        if (seen.containsKey(serial)) {
            node.isDup = true;
            seen.get(serial).isDup = true;
        } else {
            seen.put(serial, node);
        }

        return serial;
    }

    void dfs(Node node, List<String> path, List<List<String>> res) {
        for (String name : node.map.keySet()) {
            Node next = node.map.get(name);
            if (next.isDup) continue;
            path.add(name);
            res.add(new ArrayList<>(path));
            dfs(next, path, res);
            path.remove(path.size() - 1);
        }
    }
}
