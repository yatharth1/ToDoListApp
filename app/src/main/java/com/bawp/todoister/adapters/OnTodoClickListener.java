package com.bawp.todoister.adapters;

import com.bawp.todoister.model.Task;

public interface OnTodoClickListener {
    void onTodoClick(Task task);
    void onTodoRadioButtonClick(Task task);
}
