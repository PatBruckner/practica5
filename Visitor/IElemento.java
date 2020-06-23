package practica5.Visitor;

public interface IElemento {
    String enfermedad();
    void accept(IVisitor visitor);
}
