package doublematrix;

public class MyObject implements Comparable<MyObject> {
    int w1 = 0;
    int w2 = 0;
    int w3 = 0;
    int w4 = 0;

    public MyObject(int w1, int w2, int w3, int w4) {
        this.w1 = w1;
        this.w2 = w2;
        this.w3 = w3;
        this.w4 = w4;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + w1;
        result = prime * result + w2;
        result = prime * result + w3;
        result = prime * result + w4;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyObject other = (MyObject) obj;
        if (w1 != other.w1)
            return false;
        if (w2 != other.w2)
            return false;
        if (w3 != other.w3)
            return false;
        if (w4 != other.w4)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "MyObject [w1=" + w1 + ", w2=" + w2 + ", w3=" + w3 + ", w4=" + w4 + "]";
    }

    @Override
    public int compareTo(MyObject o) {
        int result1 = this.w1 - o.w1;
        int result2 = (result1 == 0) ? (this.w2 - o.w2) : result1;
        int result3 = (result2 == 0) ? (this.w3 - o.w3) : result2;
        int result4 = (result3 == 0) ? (this.w4 - o.w4) : result3;
        return result4;
    }

}
