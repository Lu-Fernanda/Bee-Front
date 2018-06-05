package edu.sergioarboleda.rumbacoin;

import edu.sergioarboleda.rumbacoin.Billetera;
import edu.sergioarboleda.rumbacoin.Parche;
import edu.sergioarboleda.rumbacoin.Transferencia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130425-rNA", date="2018-06-05T11:30:17")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile ListAttribute<Usuario, Transferencia> transferenciaList;
    public static volatile ListAttribute<Usuario, Parche> parcheList;
    public static volatile SingularAttribute<Usuario, Integer> id;
    public static volatile SingularAttribute<Usuario, Billetera> idBilletera;
    public static volatile SingularAttribute<Usuario, String> nombre;

}