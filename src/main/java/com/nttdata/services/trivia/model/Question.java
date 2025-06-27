package com.nttdata.services.trivia.model;

import java.util.List;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Model Object representing a trivia question. Contains the ID, question ID, topic, question text,
 * list of options, and the correct answer.
 *
 * <p>This class includes defensive copying to prevent external modification of internal state.</p>
 *
 * @author <a href="ajavierv@emeal.nttdata.com">ajavierv@emeal.nttdata.com</a>
 */
@Data
@Builder
@Document(collection = "questions")

public class Question {
  @Id
  private String id;
  private int questionId;
  private String topic;
  private String question;
  private List<String> options;
  private String answer;
}
