package functions;

import java.util.functions.Function;

public class Lower implements Function<String, String> {
  public String apply(String s) {
    return s.toLowerCase();
  }
}
