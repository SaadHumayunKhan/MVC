// model.js
class TaskModel {
    constructor() {
        this.tasks = [];
    }

    // Add a new task
    addTask(task) {
        this.tasks.push(task);
    }

    // Remove a task by index
    removeTask(index) {
        this.tasks.splice(index, 1);
    }

    // Get all tasks
    getTasks() {
        return this.tasks;
    }
}

