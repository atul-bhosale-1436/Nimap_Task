package org.task.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.task.model.Category;

public interface CategoryServiceInterface {

    Page<Category> getAllCategories(Pageable pageable);

    Category createCategory(Category category);

    Category getCategoryById(Long id);

    Category updateCategory(Long id, Category updatedCategory);

    boolean deleteCategory(Long id);
}
