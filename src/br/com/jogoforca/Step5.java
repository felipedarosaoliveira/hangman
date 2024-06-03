package br.com.jogoforca;

public class Step5 implements StepFork{
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
                         |                   /|      |\\
                         |                \\/  |      |  \\/
                         |                    |      |
                         |                    ________
                         |                     |
                         |                     |
                       -----                  _|
                       |   |
                    ----------
                    |        |
                    ----------
                """;
        System.out.println(step);
    }

}

