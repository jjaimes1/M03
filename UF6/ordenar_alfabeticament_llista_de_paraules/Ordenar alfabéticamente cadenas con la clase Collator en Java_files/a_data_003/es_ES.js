define("translations",["require"],function(define){return define.amd=!0,function(a){"function"==typeof define&&define.amd?define(["moment"],a):"object"==typeof exports?module.exports=a(require("../moment")):a(window.moment)}(function(a){var b="ene._feb._mar._abr._may._jun._jul._ago._sep._oct._nov._dic.".split("_"),c="ene_feb_mar_abr_may_jun_jul_ago_sep_oct_nov_dic".split("_");return a.defineLocale("es",{months:"enero_febrero_marzo_abril_mayo_junio_julio_agosto_septiembre_octubre_noviembre_diciembre".split("_"),monthsShort:function(a,d){return/-MMM-/.test(d)?c[a.month()]:b[a.month()]},weekdays:"domingo_lunes_martes_miércoles_jueves_viernes_sábado".split("_"),weekdaysShort:"dom._lun._mar._mié._jue._vie._sáb.".split("_"),weekdaysMin:"Do_Lu_Ma_Mi_Ju_Vi_Sá".split("_"),longDateFormat:{LT:"H:mm",L:"DD/MM/YYYY",LL:"D [de] MMMM [del] YYYY",LLL:"D [de] MMMM [del] YYYY LT",LLLL:"dddd, D [de] MMMM [del] YYYY LT"},calendar:{sameDay:function(){return"[hoy a la"+(1!==this.hours()?"s":"")+"] LT"},nextDay:function(){return"[mañana a la"+(1!==this.hours()?"s":"")+"] LT"},nextWeek:function(){return"dddd [a la"+(1!==this.hours()?"s":"")+"] LT"},lastDay:function(){return"[ayer a la"+(1!==this.hours()?"s":"")+"] LT"},lastWeek:function(){return"[el] dddd [pasado a la"+(1!==this.hours()?"s":"")+"] LT"},sameElse:"L"},relativeTime:{future:"en %s",past:"hace %s",s:"unos segundos",m:"un minuto",mm:"%d minutos",h:"una hora",hh:"%d horas",d:"un día",dd:"%d días",M:"un mes",MM:"%d meses",y:"un año",yy:"%d años"},ordinal:"%dº",week:{dow:1,doy:4}})}),{"Edit profile":"Editar perfil",Private:"Privado",Following:"Siguiendo",Follow:"Seguir",Avatar:"Avatar","1 comment":"1 comentario","%(numPosts)s comments":"%(numPosts)s comentarios","Also on %(forumName)s":"También en %(forumName)s","%(guestCount)s Guest Votes":"%(guestCount)s votos como invitado","1 Guest Vote":"1 voto como invitado","%(guestCount)s Others":"%(guestCount)s Otros","1 Other":"1 Otro",Channels:"Canales","Places to start your own discussions.":"Sitios donde iniciar tus propias conversaciones.",Dismiss:"Descartar","Please enter your name.":"Por favor introduce tu nombre.","Please enter your email address.":"Por favor introduce tu dirección de correo.","Invalid email address.":"Dirección de correo inválida.","Please enter a password.":"Por favor introduce una contraseña.","Password must have at least 6 characters.":"La contraseña debe tener al menos 6 caracteres.","Name must have at least %(minLength)s characters.":"Nombre debe tener al menos %(minLength)s caracteres.","Name must have less than %(maxLength)s characters.":"Nombre debe tener menos de %(maxLength)s caracteres.","Location must have less than %(maxLength)s characters.":"Ubicación debe tener menos de %(maxLength)s caracteres.","Site must have less than %(maxLength)s characters.":"Sitio debe tener menos de %(maxLength)s caracteres.","Please enter a valid site.":"Por favor introduce un sitio válido.","Comments can't be blank.":"Los comentarios no pueden estar en blanco.","Comments must have at least 2 characters.":"Comentarios deben tener al menos 2 caracteres.","Please sign in or enter a name and email address.":"Por favor conéctate o introduce un nombre y dirección de correo.","Please enter both a name and email address.":"Por favor introduce tu nombre y dirección de email.","Invalid email address format.":"Formato de email inválido.","Upload Images":"Subir imágenes",Attach:"Adjuntar","Media attachment":"Añadir archivos multimedia","Media preview placeholder":"Vista previa de archivos multimedia","Unfortunately your image upload failed. Please verify that the file is valid and in a supported format (JPEG, PNG, or GIF).":"Lo sentimos, la imagen no se pudo enviar. Por favor, verifica que el fichero es válido y está en el formato correcto (JPEG, PNG, o GIF).","Unfortunately your image upload failed. Please verify that the file is in a supported format (JPEG, PNG, or GIF).":"Lo sentimos, la imagen no se pudo enviar. Por favor, verifica que tu imagen está en el formato correcto (JPEG, PNG, o GIF).","Unfortunately your image upload failed. Please verify that your image is under 5MB.":"Lo sentimos, la imagen no se pudo enviar. Por favor, verifica que tu imagen no supera los 5MB.","You must be logged in to upload an image.":"Debes estar conectado para subir una imagen.","Unfortunately your image upload failed. Please verify that your image is in a supported format (JPEG, PNG, or GIF) and under 5MB. If you continue seeing this error, please try again later.":"Lo sentimos, la imagen no se pudo enviar. Por favor, verifica que tu imagen está en el formato correcto (JPEG, PNG, o GIF) y no supera los 5MB. Si continúas viendo este error, por favor inténtalo de nuevo más tarde.","Sorry we didn't catch that. Try again?":"Sentimos no entenderlo correctamente. ¿Quieres volver a intentarlo?","Did you know you can drag and drop images too? Try it now!":"¿Sabías que también puedes arrastrar y soltar imágenes? ¡Pruébalo ahora!","Join the discussion…":"Únete a la conversación...","Start the discussion…":"Sé el primero en comentar...","Please wait until your images finish uploading.":"Por favor espera hasta que las imágenes terminen de subir.","Oops! We're having trouble posting your comment. Check your internet connection and try again.":"Hay problemas para publicar tu comentario. Comprueba tu conexión a Internet e inténtalo de nuevo","Description must have at least %(minLength)s characters.":"La descripción debe tener al menos %(minLength)s carácteres.","Description must have less than %(maxLength)s characters.":"La descripción no debe tener más de %(maxLength)s carácteres.",Gray:"Gris",Blue:"Azul",Green:"Verde",Yellow:"Amarillo",Orange:"Naranja",Red:"Rojo",Purple:"Púrpura","That email address is already registered with a Disqus account. Log in or enter another email.":"Esta dirección de correo electrónico ya está asociada a una cuenta Disqus. Inicia sesión o introduce otra cuenta.","The e-mail address you specified is already in use.":"La dirección de correo electrónico especificada ya está en uso.","Try logging in.":"Prueba a iniciar sesión.",Thumbnail:"Miniatura",Play:"Reproducir",Hide:"Ocultar",View:"Vista","One other person is typing…":"Otra persona está escribiendo...","%(num)s other people are typing…":"Otras %(num)s personas están escribiendo...","Featured by %(forum)s":"Destacado por %(forum)s","Sponsored on Disqus":"Promocionado en Disqus","Hold on, this is waiting to be approved by %(forum)s.":"Esto está pendiente de aprobación por %(forum)s.","Are you sure you want to flag this comment?":"¿Estás seguro que deseas marcar este comentario?","Are you sure you want to block this user?":"¿Estás seguro de querer bloquear a este usuario?","Something went wrong while trying to block this user. Please try again later.":"Algo salió mal al intentar el bloqueo de este usuario. Por favor inténtalo de nuevo más tarde. ","Unfortunately this user could not be blocked; you have reached the limit for number of users blocked.":"Lo sentimos, este usuario no pudo ser bloqueado; has alcanzado el límite máximo de usuarios bloqueados.","Are you sure you want to delete this comment? You cannot undo this action.":"¿Seguro que quieres borrar este comentario? Está acción no puede deshacerse.","This discussion has been closed.":"Esta conversación se ha cerrado.","Be the first to comment.":"Sé el primero en comentar.","Nothing in this discussion yet.":"Aun no hay comentarios. Sé el primero en comentar.","You must sign in to down-vote this post.":"Identifícate para valorar negativamente esta publicación.","You must sign in to up-vote this post.":"Identifícate para valorar positivamente esta publicación.","Ban User":"Bloquear usuario","Last 30 days of comments:":"Comentarios de los últimos 30 días:","Do nothing":"No hacer nada",Delete:"Eliminar","Mark as spam":"Marcar como spam",Note:"Nota",Save:"Guardar",Cancel:"Cancelar",User:"Usuario",Email:"Correo electrónico","IP Address":"Dirección IP","We are unable to post your comment because you have been banned by %(blocker)s.":"Lo sentimos, no podemos publicar tu comentario porque has sido bloqueado por %(blocker)s.","Find out more.":"¿Quieres saber más?","Save Edit":"Guardar los cambios","%(forumName)s requires you to verify your email address before posting.":"%(forumName)s requiere que verifiques tu email antes de publicar.","Verify Email":"Verifica el correo electrónico","Send verification email to %(email)s":"Enviar correo electrónico de verificación a %(email)s","Drag and drop your images here to upload them.":"Arrastra aquí tus imágenes para subirlas.","Post as %(name)s":"Publicar como %(name)s","Log in with":"Iniciar sesión con","or sign up with Disqus":"o registrarse con Disqus","or pick a name":"o escoge un nombre","Disqus is a discussion network":"Disqus es una red social","Disqus never moderates or censors. The rules on this community are its own.":"Disqus nunca modera o censura. Las normas de esta comunidad son las de la propia comunidad.","Your email is safe with us. It's only used for moderation and optional notifications.":"Tu correo está seguro con nosotros. Solo se utiliza para la moderación y notificaciones.","Don't be a jerk or do anything illegal. Everything is easier that way.":"Disqus es una red de comentarios. Respeta las opiniones de todos los usuarios y conversaciones.","Read full terms and conditions":"Leer términos y condiciones",Name:"Nombre",Password:"Contraseña","Privacy Policy":"Política de privacidad","Terms of Service":"Condiciones de servicio","Basic Rules":"Reglas básicas","By signing up, you agree to the %(Disqus)s %(basicRules)s, %(serviceTerms)s, and %(privacyPolicy)s.":"Al registrarte, aceptas las %(Disqus)s %(basicRules)s, %(serviceTerms)s, y %(privacyPolicy)s.","By posting, you agree to the %(Disqus)s %(basicRules)s, %(serviceTerms)s, and %(privacyPolicy)s.":"Al publicar, aceptas las %(Disqus)s %(basicRules)s, %(serviceTerms)s, y %(privacyPolicy)s.","I'd rather post as a guest":"Prefiero comentar como invitado",Post:"Artículo",Next:"Siguiente","Connect with %(forumName)s":"Conectar con %(forumName)s","%(forumName)s needs permission to access your account.":"%(forumName)s requiere permiso para acceder a tu cuenta.","Featured Comment":"Comentario destacado",MOD:"MODERADOR","1 vote":"Un voto","%(numLikesReceived)s votes":"%(numLikesReceived)s votos","Full profile":"Perfil completo","Comments continue after advertisement":"Los comentarios continúan tras el anuncio","Load more comments":"Mostrar más comentarios","Powered by Disqus":"Gestionado con Disqus","Subscribe and get email updates from this discussion":"Suscribirse y recibir actualizaciones por email de esta conversación",Subscribe:"Suscríbete","yourname@email.com":"tunombre@email.com","Add Disqus to your site":"Añade Disqus a tu sitio web","Add Disqus":"Añade Disqus ",Add:"Añadir",Privacy:"Privacidad",Best:"Mejores",Newest:"Más nuevos",Oldest:"Más antiguos","Sort by Best":"Ordenar por los mejores","Sort by Newest":"Ordenar por los más nuevos","Sort by Oldest":"Ordenar por los más antiguos",Comments:"Comentarios",Community:"Comunidad","Recommend this discussion":"Recomendar esta conversación",Recommend:"Recomendar",Recommended:"Recomendadas","Your 1st recommended discussion!":"¡Tu 1ª conversación recomendada!","Recommending means this is a discussion worth sharing. It gets shared to your followers' %(Disqus)s feeds if you log in, and gives the creator kudos!":"Las recomendaciones implican que una conversación merece ser compartida. Se comparte en las novedades de tus seguidores %(Disqus)s cuando se conectan, dando veracidad al autor.","Discussion Recommended!":"¡Conversación recomendada!","Recommending means this is a discussion worth sharing. It gets shared to your followers' %(Disqus)s feeds, and gives the creator kudos!":"Las recomendaciones implican que una conversación merece ser compartida. Se comparte en las novedades de tus seguidores %(Disqus)s, dando veracidad al autor.","See Your Feed":"Ver novedades","Find More Discussions":"Encuentra más conversaciones",Share:"Compartir","Share this discussion on":"Compartir esta conversación en","Welcome to %(Disqus)s! Discover more great discussions just like this one. We're a lot more than comments.":"¡Bienvenido a %(Disqus)s! Descubre otras conversaciones como esta. Hay mucho más detrás de los comentarios.","Get Started":"Empezar","see more":"ver más","All-Star":"Mejor valoradas",Mod:"Moderador","This comment has no content.":"Este comentario no tiene contenido.","Vote down":"Voto negativo","Vote up":"Voto positivo",Collapse:"Cerrar",Expand:"Expandir","Mark as Spam":"Marcar como spam",Moderate:"Moderar","Block User":"Bloquear usuario","Stop featuring":"Dejar de destacar","Feature this comment":"Destacar este comentario","Flag as inappropriate":"Marcar como inapropiado",Edit:"Editar",Reply:"Responder","View all comments":"Ver todos los comentarios","All Comments":"Todos los comentarios",Link:"Enlace","Leave Feedback":"Deja un comentario","You've featured a comment! This comment will now also appear at the top of the discussion.":"¡Has destacado un comentario! Ahora, este comentario aparecerá también al principio de la conversación.","This user is blocked.":"Este usuario ha sido bloqueado","This comment was deleted.":"El comentario ha sido eliminado.","This comment is awaiting moderation.":"Este comentario está pendiente de moderación.","Comment score below threshold.":"Puntuación del comentario por debajo del umbral.","Show comment.":"Mostrar comentario.","Your comment is awaiting moderation.":"Tu comentario está pendiente de moderación.","See your comment.":"Ver tu comentario.","Why?":"¿Por qué?","Show One New Comment":"Mostrar un nuevo comentario","Show %(comments)s New Comments":"Mostrar %(comments)s nuevos comentarios","Show 1 new reply":"Mostrar una nueva respuesta","Show %(replies)s new replies":"Mostrar %(replies)s nuevas respuestas","One new comment above.":"Un nuevo comentario más arriba.","%(num)s new comments above.":"%(num)s nuevos comentarios arriba.","One new comment below.":"Un nuevo comentario más abajo.","%(num)s new comments below.":"%(num)s comentarios nuevos debajo.","in this conversation":"en esta conversación",Login:"Acceder","Your Profile":"Tu perfil","Display Media":"Mostrar archivos multimedia","Hide Media":"Ocultar archivos multimedia","Edit Settings":"Cambiar la configuración","Open Thread":"Abrir conversación","Close Thread":"Cerrar conversación",Help:"Ayuda",Debug:"Eliminar",Repair:"Reparar",Logout:"Cerrar sesión","The Disqus comment system is temporarily in maintenance mode. You can still read comments during this time, however posting comments and other actions are temporarily delayed.":"El sistema de comentarios de Disqus está en mantenimiento temporalmente. Aún puedes leer los comentarios, sin embargo, escribir comentarios u otras acciones están temporalmente deshabilitadas.","Comments for this thread are now closed.":"Los comentarios en esta conversación están cerrados.","An error occurred while opening the thread. Please try again.":"Se ha producido un error al abrir la conversación. Inténtalo de nuevo","An error occurred while closing the thread. Please try again.":"Se ha producido un error al cerrar la conversación. Inténtalo de nuevo.","Email:":"Correo electrónico:","1 day":"1 día","1 week":"1 semana","2 weeks":"2 semanas",Spam:"Spam","Flag Comment":"Marcar comentario",Done:"Hecho",Flagged:"Marcado","Comment Policy":"Política de Comentarios","Please read our %(commentPolicyLink)s before commenting.":"Por favor lea nuestra %(commentPolicyLink)s antes de comentar.","%(forumName)s Comment Policy":"Política de Comentarios de %(forumName)s"}});