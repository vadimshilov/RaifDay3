package com.github.vadimshilov;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CompressorTest {

  @Test
  public void test1() {
    assertEquals("5A", Compressor.compress("AAAAA"));
  }

  @Test
  public void test2() {
    assertEquals("5A3BC", Compressor.compress("AAAAABBBC"));
  }

  @Test
  public void test3() {
    assertEquals("", Compressor.compress(""));
  }

  @Test
  public void test4() {
    assertNull(Compressor.compress(null));
  }

  @Test
  public void test5() {
    assertEquals("ABC", Compressor.compress("ABC"));
  }

  @Test
  public void test6() {
    assertEquals("A5BC", Compressor.compress("ABBBBBC"));
  }

  @Test
  public void test7() {
    StringBuilder str = new StringBuilder("jpoint");
    for (int i = 0; i < 2020; i++) {
      str.append("@");
    }
    str.append("raiffeisen.ru");
    assertEquals("jpoint2020@rai2feisen.ru", Compressor.compress(str.toString()));
  }

}
