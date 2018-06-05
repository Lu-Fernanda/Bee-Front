package edu.sergioarboleda.rumbacoin;

import edu.sergioarboleda.rumbacoin.Parche;
import edu.sergioarboleda.rumbacoin.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130425-rNA", date="2018-06-05T11:30:17")
@StaticMetamodel(Transferencia.class)
public class Transferencia_ { 

    public static volatile SingularAttribute<Transferencia, Parche> idParche;
    public static volatile SingularAttribute<Transferencia, Integer> monto;
    public static volatile SingularAttribute<Transferencia, String> pswd;
    public static volatile SingularAttribute<Transferencia, Usuario> idUsuario;
    public static volatile SingularAttribute<Transferencia, Integer> id;

}