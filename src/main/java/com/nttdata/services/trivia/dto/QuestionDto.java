package com.nttdata.services.trivia.dto;

import java.util.List;
import lombok.Builder;
import lombok.Data;

/**
 * Data Transfer Object (DTO) representing a trivia question. Contains the question ID, topic,
 * question text, list of options, and the correct answer.
 *
 * <p>This class includes defensive copying to prevent external modification of internal state.</p>
 *
 * @author <a href="ajavierv@emeal.nttdata.com">ajavierv@emeal.nttdata.com</a>
 */
@Data
@Builder
public class QuestionDto {

  /**
   * Question id.
   */
  private int questionId;

  /**
   * Topic or category of the question.
   */
  private String topic;

  /**
   * Text of the question.
   */
  private String question;

  /**
   * List of possible answer options.
   */
  private List<String> options;

  /**
   * Correct answer to the question.
   */
  private String answer;
}

