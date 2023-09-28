package M04_06;

class ClassRoom {

    Pupil[] list;

    public ClassRoom(Pupil p1, Pupil p2) {
        this.list = new Pupil[]{p1, p2, new Pupil(), new Pupil()};
    }

    public ClassRoom(Pupil p1, Pupil p2, Pupil p3) {
        this.list = new Pupil[]{p1, p2, p3, new Pupil()};
    }

    public ClassRoom(Pupil p1, Pupil p2, Pupil p3, Pupil p4) {
        this.list = new Pupil[]{p1, p2, p3, p4};
    }
}
