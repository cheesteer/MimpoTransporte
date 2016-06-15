package Modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-30T14:40:09")
@StaticMetamodel(Transporte.class)
public class Transporte_ { 

    public static volatile SingularAttribute<Transporte, String> numeroCita;
    public static volatile SingularAttribute<Transporte, Date> tiempoUnidadAlmacen;
    public static volatile SingularAttribute<Transporte, Date> tiempoEsperadescarga;
    public static volatile SingularAttribute<Transporte, Date> iniciodescarga;
    public static volatile SingularAttribute<Transporte, Date> findescarga;
    public static volatile SingularAttribute<Transporte, String> referencias;
    public static volatile SingularAttribute<Transporte, String> configuracion;
    public static volatile SingularAttribute<Transporte, Integer> embarquesporcita;
    public static volatile SingularAttribute<Transporte, String> placas;
    public static volatile SingularAttribute<Transporte, Date> diasEspera;
    public static volatile SingularAttribute<Transporte, Date> iniciodetransito;
    public static volatile SingularAttribute<Transporte, Date> horacita;
    public static volatile SingularAttribute<Transporte, Date> tiempodescarga;
    public static volatile SingularAttribute<Transporte, Integer> idCostoTransporte;
    public static volatile SingularAttribute<Transporte, String> sucursal;
    public static volatile SingularAttribute<Transporte, Integer> idTransporte;
    public static volatile SingularAttribute<Transporte, String> almacen;
    public static volatile SingularAttribute<Transporte, Date> fechaarribo;
    public static volatile SingularAttribute<Transporte, String> equipoutilizado;

}