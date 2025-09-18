class TaskManager {
    private static class Task {
        int userId;
        int taskId;
        int priority;
        Task(int userId, int taskId, int priority) {
            this.userId = userId;
            this.taskId = taskId;
            this.priority = priority;
        }
    }
    private Map<Integer, Task> taskMap; 
    private TreeSet<Task> taskSet; 
    public TaskManager(List<List<Integer>> tasks) {
        taskMap = new HashMap<>();
        taskSet = new TreeSet<>((a, b) -> {
            if (a.priority == b.priority) {
                return b.taskId - a.taskId; 
            }
            return b.priority - a.priority; 
        });
        for (List<Integer> t : tasks) {
            add(t.get(0), t.get(1), t.get(2));
        }
    }
    public void add(int userId, int taskId, int priority) {
        Task task = new Task(userId, taskId, priority);
        taskMap.put(taskId, task);
        taskSet.add(task);
    }
    public void edit(int taskId, int newPriority) {
        if (!taskMap.containsKey(taskId)) return;
        Task task = taskMap.get(taskId);
        taskSet.remove(task); 
        task.priority = newPriority; 
        taskSet.add(task); 
    }
    public void rmv(int taskId) {
        if (!taskMap.containsKey(taskId)) return;
        Task task = taskMap.get(taskId);
        taskSet.remove(task); 
        taskMap.remove(taskId); 
    }
    public int execTop() {
        if (taskSet.isEmpty()) return -1;
        Task topTask = taskSet.pollFirst(); 
        taskMap.remove(topTask.taskId); 
        return topTask.userId; 
    }
}