package dao;

import entities.Project;
import entities.ProjectId;
import entities.Task;

/**
 * Created by anakasimova on 06/07/2018.
 */
public interface ProjectDAO {

    Project saveOrUpdateProject(Project project);

    Project getProject(ProjectId id);
}
