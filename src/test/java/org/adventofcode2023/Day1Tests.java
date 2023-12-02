package org.adventofcode2023;


import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1Tests
{
  @Test
  public void testWithApprovalTests()
  {
    Approvals.verify("Hello World");
  }
}
