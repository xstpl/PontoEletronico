function proximo_segundo(){
	var hoje = new Date
	var hora = hoje.getHours()
	var minutos = hoje.getMinutes()
	var segundos = hoje.getSeconds()
	relogio = document.getElementById('relogio')
	relogio.value = hora +":"+minutos+":"+segundos
	setTimeout('proximo_segundo()',1000)
}
proximo_segundo()