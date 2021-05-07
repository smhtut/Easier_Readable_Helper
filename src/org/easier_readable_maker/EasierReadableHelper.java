package org.easier_readable_maker;

/** @author Soe Min Htut */
public class EasierReadableHelper {

  public String execute(String parameter) {
    String result = "";

    try {

      // formatting sentence by sentence follow by hyphen

      char[] c = new char[parameter.length()];
      c = parameter.toCharArray();

      System.out.println("No. of Words = " + c.length);

      for (int i = 0; i < c.length; i++) {

        if (c[i] == '.') {

          if ((i + 1) < c.length && c[i + 1] == ' ') {
            result += c[i];
            result += "\n" + "-";

          } else {
            result += c[i];
          }

        } else {
          result += c[i];
        }

      }

    } catch (NullPointerException e) {
	  e.printStackTrace();
    }
    return result;
  }
}
