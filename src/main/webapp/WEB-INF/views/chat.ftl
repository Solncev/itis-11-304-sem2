<!doctype html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/webjars/sockjs-client/sockjs.min.js"></script>
    <script type="text/javascript" src="/webjars/stomp-websocket/stomp.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css">
    <script type="text/javascript" src="../../resources/static/message.js"></script>
</head>

<body>
<div class="container" id="main-content">
    <div class="row">
        <div class="col-md-6">
            <form class="inline">
                <div class="form-group">
                    <label>
                        WebSocket connection:
                    </label>
                    <button id="connect" type="button" class="btn-group btn-default">
                        Connect
                    </button>
                    <button id="disconnect" type="button" class="btn-group btn-default" disabled="disabled">
                        Disconnect
                    </button>
                </div>
            </form>
        </div>

        <div class="col-md-6">
            <form class="inline">
                <div class="form-group">
                    <label for="name">
                        What is your name?
                    </label>
                    <input type="text" id="name" placeholder="your name here" class="form-control">

                    <label for="message">
                        Text your message
                    </label>
                    <input type="text" id="message" placeholder="message" class="form-control">

                    <button id="send" class="btn btn-default" type="button">
                        Send message
                    </button>
                </div>
            </form>
        </div>
    </div>

    <div class="row">
        <div class="col-md-12">
            <table id="conversation" class="table table-stripped">
                <thread>
                    <tr>
                        <th>Messages</th>
                    </tr>
                </thread>

                <tbody id="messages">

                </tbody>
            </table>
        </div>
    </div>
</div>
</body>