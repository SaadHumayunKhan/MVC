// view.js
class TaskView {
    constructor() {
        this.taskList = document.getElementById("taskList");
        this.taskInput = document.getElementById("taskInput");
        this.addButton = document.getElementById("addButton");
    }

    renderTasks(tasks) {
        this.taskList.innerHTML = ""; // Clear current list
        tasks.forEach((task, index) => {
            const li = document.createElement("li");
            li.textContent = task;
            const removeButton = document.createElement("button");
            removeButton.textContent = "Remove";
            removeButton.addEventListener("click", () => this.onRemoveTask(index));
            li.appendChild(removeButton);
            this.taskList.appendChild(li);
        });
    }

    // Hook for task addition
    bindAddTask(handler) {
        this.addButton.addEventListener("click", () => {
            const task = this.taskInput.value.trim();
            if (task) {
                handler(task);
                this.taskInput.value = ""; // Clear input field
            }
        });
    }

    // Hook for task removal
    bindRemoveTask(handler) {
        this.onRemoveTask = handler;
    }
}
