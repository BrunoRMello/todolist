package br.com.bruno.todolist.task;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * ID
 * Usuário
 * Description
 * title
 * Date start
 * Date end
 * Priority
 * 
 */

@Data
@Entity(name = "tb_tasks")
public class TaskModel {
  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;
  @Column(length = 100)
  private String title;
  private String description;
  private LocalDateTime startAt;
  private LocalDateTime endAt;
  private String priority;
  @CreationTimestamp
  private LocalDateTime createdAt;
  private UUID idUser;

  public void setTitle(String title) throws Exception {
    if (title.length() > 50) {
      throw new Exception("O campo title deve conter no máximo 50 caracteres");
    }

  }

}
