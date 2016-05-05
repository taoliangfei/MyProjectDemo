<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN"
"http://www.w3.org/TR/html4/strict.dtd">
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>Login form</title>
		<link rel="stylesheet" href="css/style.css">
	</head>
	<body>
		<section class="container">
		    <div class="login">
		      <h1>Login to Web App</h1>
		      <form method="post" action="index.html">
		        <p><input type="text" name="login" value="" placeholder="Username"></p>
		        <p><input type="password" name="password" value="" placeholder="Password"></p>
		        <p class="remember_me">
		          <label>
		            <input type="checkbox" name="remember_me" id="remember_me">
		            Remember me on this computer
		          </label>
		        </p>
		        <p class="submit"><input type="submit" name="commit" value="Login"><a href="#toregister" style="font-size: 12px;float: right;color: #004a80;margin: 0px 95px 0px 0px;">Register</a></p>
		      </form>
		    </div>
	
		    <div class="login-help">
		      <p>Forgot your password? <a href="index.html">Click here to reset it</a>.</p>
		    </div>
  		</section>
	</body>
</html>
