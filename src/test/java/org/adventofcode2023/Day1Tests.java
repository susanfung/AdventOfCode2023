package org.adventofcode2023;


import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import static org.adventofcode2023.Day1.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1Tests
{
  @Test
  public void testFindFirstDigit()
  {
      String[] findFirstDigitResults = {findFirstDigit("1abc2"), findFirstDigit("pqr3stu8vwx"), findFirstDigit(
              "a1b2c3d4e5f"), findFirstDigit("treb7uchet")};
      Approvals.verifyAll("First Digit", findFirstDigitResults);
  }

  @Test
  public void testFindLastDigit()
  {
      String[] findLastDigitResults = {findLastDigit("1abc2"), findLastDigit("pqr3stu8vwx"), findLastDigit(
              "a1b2c3d4e5f"), findLastDigit("treb7uchet")};
      Approvals.verifyAll("Last Digit", findLastDigitResults);
  }
}
