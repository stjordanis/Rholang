package parsing.delimc.Absyn; // Java Package generated by the BNF Converter.

public class ETuple extends Expr {
  public final Tuple tuple_;
  public final Type type_;
  public ETuple(Tuple p1, Type p2) { tuple_ = p1; type_ = p2; }

  public <R,A> R accept(parsing.delimc.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof parsing.delimc.Absyn.ETuple) {
      parsing.delimc.Absyn.ETuple x = (parsing.delimc.Absyn.ETuple)o;
      return this.tuple_.equals(x.tuple_) && this.type_.equals(x.type_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.tuple_.hashCode())+this.type_.hashCode();
  }


}