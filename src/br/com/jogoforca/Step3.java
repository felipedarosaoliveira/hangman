package br.com.jogoforca;

public class Step3 implements StepFork{
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
                         |                    ________
                         |                    |      |
                         |                   /|      |
                         |                \\/  |      |
                         |                    |      |
                         |                    ________
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

