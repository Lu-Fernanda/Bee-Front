package edu.sergioarboleda.rumbacoin;

import edu.sergioarboleda.rumbacoin.Billetera;
import edu.sergioarboleda.rumbacoin.Transferencia;
import edu.sergioarboleda.rumbacoin.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130425-rNA", date="2018-06-05T11:30:17")
@StaticMetamodel(Parche.class)
public class Parche_ { 

    public static volatile SingularAttribute<Parche, String> descripcion;
    public static volatile SingularAttribute<Parche, Boolean> estado;
    public static volatile SingularAttribute<Parche, String> pswd;
    public static volatile ListAttribute<Parche, Transferencia> transferenciaList;
    public static volatile SingularAttribute<Parche, Usuario> idUsuario;
    public static volatile SingularAttribute<Parche, Integer> valorObjetivo;
    public static volatile SingularAttribute<Parche, Integer> id;
    public static volatile SingularAttribute<Parche, Integer> valorMinimo;
    public static volatile SingularAttribute<Parche, Billetera> idBilletera;
    public static volatile SingularAttribute<Parche, String> nombre;

}