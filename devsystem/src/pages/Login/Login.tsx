import React from 'react'

type Props = {}

const Login = (props: Props) => {
  return (
    <main className='container login'>
        <section className='login-card'>
            <h1>Login</h1>

            <form>
                <article className='form-control'>
                    <label htmlFor="email">E-mail</label>
                    <input type="text" id='email' placeholder='Digite seu E-mail'/>
                </article>

                <article className='form-control'>
                    <label htmlFor="senha">Senha</label>
                    <input type="password" id='senha' placeholder='Digite sua senha'/>
                </article>

                <button type='submit'>Entrar</button>
            </form>
        </section>
    </main>
  )
}

export default Login