package com.xinchen.pattern.saga.orchestration;

import java.util.ArrayList;
import java.util.List;

/**
 * Saga representation. Saga consists of chapters. Every ChoreographyChapter is executed by a
 * certain service.
 */
class Saga {
  private final List<Chapter> chapters;

  public Saga() {
    this.chapters = new ArrayList<>();
  }

  public Saga chapter(String name) {
    this.chapters.add(new Chapter(name));
    return this;
  }

  public Chapter get(int idx) {
    return chapters.get(idx);
  }

  public boolean isPresentChapter(int idx) {
    return idx >= 0 && idx < chapters.size();
  }

  public static Saga create() {
    return new Saga();
  }

  /**
   * result for saga.
   */
  enum Result {
    FINISHED, ROLLBACK, CRASHED
  }

  static class Chapter {
    String name;

    public Chapter(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }
  }
}
