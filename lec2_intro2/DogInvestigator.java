package lec2_intro2;

class DogInvestigator {
    void main() {
        Dog lilDog = new Dog(3);
        Dog clifford = new Dog(1000);

        Dog bigger = lilDog.maxDog(clifford);
        bigger.makeNoise();
    }
}
