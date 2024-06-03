package br.com.jogoforca;

public class Step1 implements StepFork{
    @Override
    public void printStep() {
        String step = """
                         -----------------------|
                         |                      |
                         |                     _____
                         |                    | 0 0 |
                         |                    |  s  |
                         |                    | --- |
                         |                       |
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

