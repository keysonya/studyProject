package dao.mappers;

import entities.Priority;
import entities.Task;
import entities.TaskId;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Created by Iana_Kasimova on 03-Sep-18.
 */
public class TaskMapper implements RowMapper<Task> {

    @Override
    public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
        Task task = new Task(rs.getString("TITLE"));
        task.setDescription(rs.getString("DESCRIPTION"));
        if(rs.getDate("DEADLINE") != null) {
            task.setDeadline(LocalDateTime.ofInstant(rs.getDate("DEADLINE").toInstant(), ZoneId.systemDefault()));
        }
        task.setPercentOfReadiness(rs.getDouble("PERCENT_OF_READINESS"));
        if(rs.getString("PRIORITY") != null){
            task.setPriority(Priority.valueOf(rs.getString("PRIORITY")));
        }
        task.setId(new TaskId(rs.getInt("ID")));
        task.setDone(rs.getBoolean("IS_DONE"));
        if(rs.getDate("REMIND_DATE") != null) {
            task.setRemindDate(LocalDateTime.ofInstant(rs.getDate("REMIND_DATE").toInstant(), ZoneId.systemDefault()));
        }
        task.setDeleted(rs.getBoolean("IS_DELETED"));
        task.setDeletedFromProject(rs.getBoolean("IS_DELETED_FROM_PROJECT"));
        return task;
    }
}
