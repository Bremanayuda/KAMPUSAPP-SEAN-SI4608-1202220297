class Rumus {
    private double tubes, quiz, tugas, uts, uas;

    public Rumus(double tubes, double quiz, double tugas, double uts, double uas) {
        this.tubes = tubes;
        this.quiz = quiz;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public double hitungNilai() {
        double totalNilai = (0.30 * tubes) + (0.10 * quiz) + (0.10 * tugas) + (0.25 * uts) + (0.25 * uas);
        return totalNilai;
    }
}