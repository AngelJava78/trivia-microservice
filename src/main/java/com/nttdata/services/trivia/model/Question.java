package com.nttdata.services.trivia.model;

import java.util.List;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
