package com.nttdata.services.trivia.dto;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QuestionDto {
  private int questionId;
  private String topic;
  private String question;
  private List<String> options;
  private String answer;
}

