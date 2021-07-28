package homework_11;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Dump dump = new Dump();

        NightSynchronizer nightSynchronizer = new NightSynchronizer();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        final MadScientist firstMadScientist = new MadScientist(dump, nightSynchronizer, new AssistantScientist(1, 4));
        final MadScientist secondMadScientist = new MadScientist(dump, nightSynchronizer, new AssistantScientist(1, 4));

        Future<Integer> firstScientistResults = executorService.submit(firstMadScientist);
        Future<Integer> secondScientistResults = executorService.submit(secondMadScientist);

        run(dump, nightSynchronizer);

        executorService.shutdown();

        Integer numberRobotsOfFirstScientist = firstScientistResults.get();
        Integer numberRobotsOfSecondScientist = secondScientistResults.get();
        switch (numberRobotsOfFirstScientist.compareTo(numberRobotsOfSecondScientist)) {
            case -1: {
                System.out.println("Second scientist WON!!!");
                break;
            }
            case 0: {
                System.out.println("Draw.");
            }
            case 1: {
                System.out.println("First scientist WON!!!");
                break;
            }
        }
        System.out.println(" ");
        System.out.println("First scientist collected robots: " + numberRobotsOfFirstScientist);
        System.out.println("Second scientist collected robots: " + numberRobotsOfSecondScientist);

        executorService.awaitTermination(1L, TimeUnit.DAYS);
    }

    private static void run(Dump dump, NightSynchronizer nightSynchronizer) throws InterruptedException {
        do {
            nightSynchronizer.nextNight();
            dump.generateParts();
            Thread.sleep(100);

        } while (!nightSynchronizer.isLastNight());
    }
}