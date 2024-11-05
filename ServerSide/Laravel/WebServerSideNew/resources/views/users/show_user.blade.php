@extends('layout.femaster')

@section('content')
    <h4>Sou um dado do user {{ $user->name}}</h4>
    <h4>email {{ $user->email}}</h4>
@endsection
