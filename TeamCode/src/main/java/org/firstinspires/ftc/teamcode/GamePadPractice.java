package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class GamePadPractice extends OpMode{
     @Override
    public void init() {

     }
     @Override
    public void loop() {
         telemetry.addData("x", gamepad1.left_stick_x);
         telemetry.addData("y", gamepad1.left_stick_y);
         telemetry.addData("b button", gamepad1.b);
         telemetry.addData("left trigger", gamepad1.left_trigger);
         telemetry.addData("right trigger button", gamepad1.right_trigger);
         telemetry.addData("left+right trigger", gamepad1.left_trigger+gamepad1.right_trigger);
     }
}
