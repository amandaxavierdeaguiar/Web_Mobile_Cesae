@extends('layout.femaster')

@section('content')
    <ul>
        @foreach ($weekDays as $day)
            <li>{{$day}}</li>
        @endforeach
    </ul>

    <h6>Dados do curso: </h6>
    <p>Nome: {{$info['nome']}}</p>
    <p>Horas: {{$info['hours']}}h</p>

    <h6>Cesae info: </h6>
    <p>Nome: {{$cesae['name']}}</p>
    <p>Endereço: {{$cesae['address']}}</p>
    <p>E-mail: {{$cesae['email']}}h</p>


    <ul>
        <li>{{$myFirstVar}}</li>
        <li>{{$weekDays[0]}}</li>
        <li><a href="{{route('welcome')}}">Welcome!</li>
        <li><a href="{{route('users.all')}}">Todos os Utilizadores!</li>
        <li><a href="{{route('users.new')}}">Insira novos Utilizadores</li>
        <li><a href="{{route('tasks.all')}}">Todas as tarefas</li>
    </ul>
    <img src="{{asset('images/Odie.png')}}">
@endsection
