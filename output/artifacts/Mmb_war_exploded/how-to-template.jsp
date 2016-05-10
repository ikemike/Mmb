<style>

    .panel-default {
        opacity: 0.9;
    }
    .form-group.last { margin-bottom:0px; }


</style>

<div class="container-fluid">
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading">
                Opening up the Mindflex EEG headset
            </div>
            <div class="panel panel-body">
                <h4>
                    Configuring the headset to work with the Arduino Uno
                    required a little modification to the headset's circuitry.<br><br>

                <img src="images/headset2.jpg" style="width:100%">
                <br><br>

                Taking the cover off the headset unveiled a shiny PCB with
                Neurosky&#39;s emblem on it.

                <br><br>
                <img src="images/headset3.jpg" style="width:100%">
                <br><br>
                There are two things I needed to do here: <br><br>
                One is to intercept the serial data coming off the headset,
                the other is to complete the connection by finding a grounding point.

                The first part was done by locating the pin labeled &#39;&#39;T&#39;&#39;. This connection is located in a cluster of four other tiny pins.

                The second part was accomplished by soldering a wire to the board&#39;s main negative terminal.
                <br><br>

                <img src="images/arduino1.jpg" style="width:100%">
                <br><br>
                Once the headset has been modified and screwed back together, it's time to hook it up!
                </h4>
            </div>
            <div class="panel-footer">

            </div>
        </div>
    </div>
</div>

