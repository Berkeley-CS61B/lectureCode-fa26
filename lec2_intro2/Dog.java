// don't worry too much about the fact
// that this file starts with lec2_intro2
// it's just because this lectureCode-fa26
// folder contains many subfolders of code,
// e.g. lec1_intro1, lec2_intro2
package lec2_intro2;

class Dog {
    // let's list off the properties of a Dog
    int size;

    // this is not a method
    // this is a constructor
    // it says how to make Dogs
    Dog(int s) {
        size = s;
    }

    void makeNoise() {
        if (this.size < 10) {
            IO.println("yipyipyippyip");
        } else if (this.size < 30) {
            IO.println("bark");
        } else {
            IO.println("aroooooooooooo");
        }
    }

    static void main() {
        Dog d = new Dog(5);
        d.makeNoise();
    }

    // return the larger of the dogs
    public Dog maxDog(Dog otherDog) {
        if (otherDog.size > this.size) {
            return otherDog;
        }
        return this; // the only choice here is this
    }

    // static means there is no 'this'
    // and the method must invoked
    // by calling Dog.maxDog
    static Dog maxDog(Dog ep, Dog milo) {
        if (ep.size > milo.size) {
            return ep;
        }
        return milo;
    }
}

// public means nothign today
// sometimes I'm doing it, sometimes I'm not
// sorry