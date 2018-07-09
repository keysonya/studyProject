package services;

import entities.Project;
import entities.ProjectId;
import entities.Task;

/**
 * Created by anakasimova on 06/07/2018.
 */
public interface ProjectService {

    Project createProject(String title);

    Project saveProject(Project project);

    void deleteProject(Project project);

    Project addTaskToProject(Project project, Task task);

    Project deleteTaskFromProject(Project project, Task task);


}
