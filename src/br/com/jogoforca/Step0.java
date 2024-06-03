package br.com.jogoforca;

public class Step0 implements StepFork{
    @Override
    public void printStep() {
        String step = """
                         -----------------------|
                         |                      |
                         |
                         |
                         |
                         |
                         |
                         |
                         |
                         |
                         |
                         |
                         |
                         |
                         |
                       -----
                       |   |
                    ----------
                    |        |
                    ----------
                """;
        System.out.println(step);
    }

}

