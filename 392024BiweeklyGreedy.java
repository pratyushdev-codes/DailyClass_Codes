class Pair {
    double r;
    int d;
    int h;

  public Pair (double r , int d , int h){
    this.r = r;
    this.d= d ;
    this.h= h;
    
  }class 392024 BiweeklyGreedy{

    public long minDamage(int power, int[] damage, int[] health) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        long dmg;
        for (int i = 0; i < health.length; i++) {
            dmg += (long) damage;
            int hit = (health[i] - 1) / power + 1;

            double ratio = damage[i] / (double) hit;

            pq.add(new Pair(ratio, damage[i], health[i]));
        }

        long ans = 0;
        while (!pq.isEmpty()) {

            Pair p = pq.remove();

            int hit = (p.h + 1) / power + 1;
            ans += hit * dmg;

        }

        return ans;

    }
}

}