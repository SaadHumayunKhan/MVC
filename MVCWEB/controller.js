// controller.js
class TaskController {
    constructor(model, view) {
        this.model = model;
        this.view = view;

        // Bind View events
        this.view.bindAddTask(this.handleAddTask);
        this.view.bindRemoveTask(this.handleRemoveTask);

        // Initial render
        this.view.renderTasks(this.model.getTasks());
    }

    // Add a task
    handleAddTask = (task) => {
        this.model.addTask(task);
        this.view.renderTasks(this.model.getTasks());
    };

    // Remove a task
    handleRemoveTask = (index) => {
        this.model.removeTask(index);
        this.view.renderTasks(this.model.getTasks());
    };
}
