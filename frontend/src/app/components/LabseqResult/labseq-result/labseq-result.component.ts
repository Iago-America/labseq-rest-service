import { Component, OnInit } from '@angular/core';
import { LabseqHttpService } from '../../../services/labseq-http.service';
import { CommonModule, NgIf } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-labseq-result',
  standalone: true,
  imports: [CommonModule, NgIf, FormsModule],
  templateUrl: './labseq-result.component.html',
  styleUrl: './labseq-result.component.css'
})
export class LabseqResultComponent implements OnInit {
  getPost: string = "";
  inputNumber: number = 0;

  constructor(private apiService: LabseqHttpService) {}

  ngOnInit() {
  }

  getLabseqValue() {
    this.apiService.getLabseqValue(this.inputNumber).subscribe(
      response => {
        this.getPost = response;
      },
      error => {
        console.error('Number too large to be represented', error);
        this.getPost = "Error fetching Labseq value";
      }
    );
  }
}
