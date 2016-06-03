package Modelo;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-30T14:40:09")
@StaticMetamodel(CostoTransporte.class)
public class CostoTransporte_ { 

    public static volatile SingularAttribute<CostoTransporte, BigDecimal> precio;
    public static volatile SingularAttribute<CostoTransporte, Integer> idCostoTransporte;
    public static volatile SingularAttribute<CostoTransporte, String> ruta;
    public static volatile SingularAttribute<CostoTransporte, String> concepto;
    public static volatile SingularAttribute<CostoTransporte, String> observacion;

}