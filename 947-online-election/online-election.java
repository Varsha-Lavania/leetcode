class TopVotedCandidate {

    private int[] times;
    private int[] leaders;

    public TopVotedCandidate(int[] persons, int[] times) {

        this.times = times;
        this.leaders = new int[persons.length];

        Map<Integer, Integer> count = new HashMap<>();

        int leader = -1;
        int maxVotes = 0;

        for (int i = 0; i < persons.length; i++) {

            int person = persons[i];

            count.put(person,
                      count.getOrDefault(person, 0) + 1);

            if (count.get(person) >= maxVotes) {
                leader = person;
                maxVotes = count.get(person);
            }

            leaders[i] = leader;
        }
    }

    public int q(int t) {

        int left = 0;
        int right = times.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (times[mid] <= t) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return leaders[right];
    }
}