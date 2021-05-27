def insertaPila(valor)
	if ($tope <$tamano-1)
	    $tope = $tope+1
	    $pila[$tope]=valor
	end
end
def eliminaElemento()
    valor = 0
    if ($tope>-1)
       valor = $pila[$tope]
       $tope= $tope-1
    end
    return valor
end
def muestraArreglo()
    if ($tope > -1)
        for i in 0..$tope
           puts $pila[i]
        end
    end
end
def sumaValores()
    suma = 0
    while ($tope > 0)
        num1 = eliminaElemento
        num2 = eliminaElemento
        insertaPila(num1+num2)
    end
end
def eliminaNelementos(n)
    cont=0
    while (cont <n)
        eliminaElemento
        cont = cont +1
    end
end
$pila=[]
$tope=-1
puts "Ingrese tamaño de la Pila"
$tamano=gets.to_i
insertaPila(10)
insertaPila(20)
insertaPila(30)
insertaPila(40)
insertaPila(5)
insertaPila(2)
muestraArreglo()
#sumaValores
puts "Ingrese N elementos a eliminar"
n = gets.to_i
eliminaNelementos(n)
muestraArreglo
