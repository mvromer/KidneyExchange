package KidneyExchange.Graph;

import java.util.Objects;

// A directed edge points to a particular target Node<T> and has an associated weight.
public class DirectedEdge<T> {
    private Node<T> target;
    private int weight;

    public DirectedEdge( Node<T> target, int weight ) {
        this.target = target;
        this.weight = weight;
    }

    public DirectedEdge( Node<T> target ) {
        this( target, 1 );
    }

    public Node<T> getTarget() {
        return target;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals( Object o ) {
        if( this == o ) return true;
        if( o == null || getClass() != o.getClass() ) return false;
        DirectedEdge<?> that = (DirectedEdge<?>) o;
        return Double.compare( that.weight, weight ) == 0 &&
                Objects.equals( target, that.target );
    }

    @Override
    public int hashCode() {
        return Objects.hash( target, weight );
    }

    @Override
    public String toString() {
        return " --" + weight + "--> " + target.unwrap();
    }
}
