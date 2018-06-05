package edu.sergioarboleda.rumbacoin;

import edu.sergioarboleda.rumbacoin.Parche;
import edu.sergioarboleda.rumbacoin.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130425-rNA", date="2018-06-05T11:30:17")
@StaticMetamodel(Billetera.class)
public class Billetera_ { 

    public static volatile ListAttribute<Billetera, Usuario> usuarioList;
    public static volatile ListAttribute<Billetera, Parche> parcheList;
    public static volatile SingularAttribute<Billetera, Integer> dinero;
    public static volatile SingularAttribute<Billetera, Integer> id;

}