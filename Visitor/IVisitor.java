package practica5.Visitor;

public interface IVisitor {
    void visit(Perro perro);
    void visit(Gato gato);
    void visit(Caballo caballo);
}
